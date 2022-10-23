package brokers.storages

import models.students.Student

class StorageBroker extends IStorageBroker {
  override def insertStudent(student: Student): Student = student
}
