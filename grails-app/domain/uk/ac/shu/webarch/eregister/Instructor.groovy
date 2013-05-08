package uk.ac.shu.webarch.eregister

/**
 * Instructor teaches a class
 *
 * Ideally we want a class to have many instructors but it will be kept simple for clarity
 *
 */


class Instructor {

//Domain classes will get an ID property which is auto incremented

String name
String staffId

	Set classes

//We tell the framework classes is actually a set of RegClass instances

	static hasMany=[classes: RegClass]

//Gives the framework a hint about how to form the join

	static mappedBy=[classes: 'classInstructor']


    static constraints = {
	name(nullable:false, blank:false,maxSize:256);
	staffId(nullable:flase, blank:false,maxSize:20);    

}
}
