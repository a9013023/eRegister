package uk.ac.shu.webarch.eregister

//A class
//Was named RegCLass to avoid classes with java keyword "class"

class RegClass {

	String name

	Instructor classInstructor

	Course course

	Set enrolledStudents


	static hasMany = [classes: enrolledStudents]

	static mappedBy = [student: 'student_fk']


    static constraints = {
    }

   static mapping = {
	classInstructor column:'instructor_fk'
	course column:'course_fk'
}


}
