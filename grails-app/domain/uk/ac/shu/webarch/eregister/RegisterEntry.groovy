package uk.ac.shu.webarch.eregister

//An entry for a particular student. 
//Properties will be stored here and it is useful to have the relationship in its own right

class RegisterEntry {

Student student

RegistrationSheet regsheet

Long timestamp

    static constraints = {
	timestamp(nullable:false, blank:false);
    }

   static mapping = {
	table 'student_register_entry'
	student column: 'student_fk'
	regsheet column: 'reg_sheet_fk'
	
	
}
