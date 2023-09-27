package com.example.teacher

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import com.example.teacher.databinding.ActivityTeacherAdapterBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener

class TeacherAdapter : AppCompatActivity() {
    private lateinit var adapter: CategoryAdapter
    lateinit var mList: ArrayList<CountryData>
private lateinit var binding: ActivityTeacherAdapterBinding
private var storageReference:StorageReference=
        FirebaseStorage.getInstance().getReference("TeacherImage")
    private var databaseReference:DatabaseReference=
        FirebaseDatabase.getInstance().getReference("TeacherData")
    private var imageUri: Uri? = null
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityTeacherAdapterBinding.inflate(layoutInflater)
    setContentView(binding.root)
    setContentView(binding.root)
}

}




