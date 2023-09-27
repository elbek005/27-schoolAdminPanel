package com.example.teacher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.teacher.databinding.ActivityClassTableBinding
import com.google.firebase.database.FirebaseDatabase

class ClassTableActivity : AppCompatActivity() {
    private val firebaseData = FirebaseDatabase.getInstance().getReference("Table")
    private val ref = FirebaseDatabase.getInstance().getReference("Class")
    private lateinit var binding: ActivityClassTableBinding
    private var classId = ""
    private var classTitle = ""
    private lateinit var mTableList: ArrayList<TableData>
    private lateinit var spinnerBtn: TextView
    private lateinit var myAdapter: TableAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_table)
    }
}