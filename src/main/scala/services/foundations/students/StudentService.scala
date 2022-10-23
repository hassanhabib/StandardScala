package services.foundations.students

import brokers.storages.IStorageBroker
import models.students.Student

class StudentService(storageBroker: IStorageBroker) extends IStudentService {
  override def addStudent(student: Student): Student = {
    this.storageBroker.insertStudent(student)
  }
}
