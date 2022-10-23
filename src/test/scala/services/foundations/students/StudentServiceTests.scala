package services.foundations.students

import brokers.storages.IStorageBroker
import models.students.Student
import org.mockito.Mockito.{times, verify, when}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.mockito.MockitoSugar.mock

class StudentServiceTests extends AnyFunSuite{
  test(testName = "Should Add Student")
  {
    // given
    val randomStudent = mock[Student]
    val inputStudent = randomStudent
    val insertedStudent = inputStudent
    val expectedStudent = insertedStudent

    val storageBrokerMock: IStorageBroker =
      mock[IStorageBroker]

    val studentService: StudentService =
      new StudentService(storageBrokerMock)

    when(storageBrokerMock.insertStudent(inputStudent))
      .thenReturn(insertedStudent)

    // when
    val actualStudent : Student =
      studentService.addStudent(inputStudent)

    // then
    assert(actualStudent == expectedStudent)

    verify(storageBrokerMock, times(1))
      .insertStudent(inputStudent)
  }
}
