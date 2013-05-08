package uk.ac.shu.webarch.eregister

//An entry for a particular student. 

class RegisterEntry {

Student student

//******TO DO
//Add property called regSheet of type RegistrationSheet
//Use the mapping facility to make the column name 'reg_sheet_fk'

Long timestamp

    static constraints = {
	timestamp(nullable:false, blank:false);
    }

   static mapping = {
	table 'student_register_entry'
	student column: 'student_fk'
}
