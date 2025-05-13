package com.example.mapsapp.viewmodels

import androidx.lifecycle.MutableLiveData
import com.example.mapsapp.MyApp
import kotlinx.coroutines.Dispatchers

class SupaViewModel {
    /*
    val database = MyApp.database
    private val _studentName = MutableLiveData<String>()
    val studentName = _studentName
    private val _studentMark = MutableLiveData<String>()
    val studentMark = _studentMark
    fun insertNewStudent(name: String, mark: String) {
        val newStudent = Student(name = name, mark = mark.toDouble())
        CoroutineScope(Dispatchers.IO).launch {
            database.insertStudent(newStudent)
            getAllStudents()
        }
    }
    private val _studentsList = MutableLiveData<List<Student>>()
    val studentsList = _studentsList

    fun getAllStudents() {
        CoroutineScope(Dispatchers.IO).launch {
            val databaseStudents = database.getAllStudents()
            withContext(Dispatchers.Main) {
                _studentsList.value = databaseStudents
            }
        }
    }
     */

}