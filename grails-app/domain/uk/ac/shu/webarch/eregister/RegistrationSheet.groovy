package uk.ac.shu.webarch.eregister

class RegistrationSheet {

	Course course

	Date sheetDate

	Set signatories

	String notes

//****TO DO
//Add metadata to add a list if RegisterEntry classes for this sheet. 1 sheet has many enteries

//Will need a property that points back to this RegistrationSheet. Impliment this 1st


    static constraints = {
	course(nullable:false, blank:false);
	sheetDate(nullable:false, blank:false);
	notes(nullable:true, blank:true);
    }

   static mapping = {
	notes column: 'course_desc', type:'text'

}
}
