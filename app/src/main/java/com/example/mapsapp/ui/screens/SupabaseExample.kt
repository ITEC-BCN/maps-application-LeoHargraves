package com.example.mapsapp.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun StudentsScreen(navigateToDetail: (String) -> Unit) {
    /*
    val myViewModel = viewModel<MyViewModel>()
    val studentName: String by myViewModel.studentName.observeAsState("")
    val studentMark: String by myViewModel.studentMark.observeAsState("")
    Column(Modifier.fillMaxSize()) {
        Column(Modifier.fillMaxWidth().weight(0.4f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text("Create new student", fontSize = 28.sp, fontWeight = FontWeight.Bold)
            TextField(value = studentName, onValueChange = { myViewModel.editStudentName(it) })
            TextField(value = studentMark, onValueChange = { myViewModel.editStudentMark(it) })
            Button(onClick = { myViewModel.insertNewStudent(studentName, studentMark) }) {
                Text("Insert")
            }
        }
    }
    val studentsList by myViewModel.studentsList.observeAsState(emptyList<Student>())
    myViewModel.getAllStudents()
    LazyColumn(
        Modifier
            .fillMaxWidth()
            .weight(0.6f)
    ) {
        items(studentsList) { student ->
            StudentItem(student) { navigateToDetail(student.id.toString()) }
        }
    }
     */

}
/*
@Composable
fun StudentItem(student: Student, navigateToDetail: (String) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth().background(Color.LightGray).border(width = 2.dp, Color.DarkGray)
            .clickable { navigateToDetail(student.id.toString()) }) {
        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(student.name, fontSize = 28.sp, fontWeight = FontWeight.Bold)
            Text(text = "Mark: ${student.mark}")
        }
    }
}
 */