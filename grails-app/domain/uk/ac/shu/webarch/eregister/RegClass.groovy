package uk.ac.shu.webarch.eregister

//A class
//Was named RegCLass to avoid classes with java keyword "class"

class RegClass {

	String name

	Instructor classInstructor

	Course course

	Set enrolledStudents

//*****TO DO
//Will need hasMany adding for enrolledStudents
//Will need to be mapped by section so the class knows to use the student property of the enrolled class as a foreign key

	static constraints = [
]

	static constraints = [
]


    static constraints = {
    }

   static mapping = {
	classInstructor column:'instructor_fk'
	course column:'course_fk'
}


}
