package uk.ac.shu.webarch.eregister

class Course {

	String courseName
	String courseCode
	String description
	int myIntProp=1

	/* The set of classes where this course is being taught */
	Set classes


    static constraints = {
	courseCode maxSize: 20
    }


    static hasMany = [classes: RegClass]
    static mappedBy = [classes: 'course']
	
	// Chnages the SQL column name for description from default "description" to
	//"course_desc" and the datatype from the convention-generated varchar to the LOB text type

    static mapping = {
	table 'course'
 	courseName column: 'course_name'
	courseCode column: 'mapped_course_code'
	description column: 'course_desc', type:'text'
	}

}
