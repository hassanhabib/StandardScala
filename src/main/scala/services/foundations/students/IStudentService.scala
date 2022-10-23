package services.foundations.students

import models.students.Student

trait IStudentService {
  def addStudent(student: Student) : Student
}
