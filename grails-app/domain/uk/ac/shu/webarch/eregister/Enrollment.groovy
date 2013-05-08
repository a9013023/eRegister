package uk.ac.shu.webarch.eregister

//Represents the link between the student and a course

//I could have used hasMany mappings on both sides
//However this allows us to add properties to the join table

class Enrollment {

	Student student
	Course course

    static constraints = {
    }


   static mapping = {
	table 'course_student'
	student column: 'student_fk'
	course column: 'course_fk'
}
}
