package brokers.storages // namespace

import models.students._

trait IStorageBroker {
  def insertStudent(student: Student) : Student
}
