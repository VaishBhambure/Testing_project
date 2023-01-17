package newpackage;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class para_testng {
	@Test

	@Parameters({"Reviewer_1","Reviewer_2"})

	    public void check_if_shortlisted(int marks_1, int marks_2)

	    {

	       float average = (marks_1 + marks_2)/2;

	       System.out.println("The average achieved by the writer is " + average);

	       if(average >= 4){

	           /* put this writer in the shortlisted category” */

	       } else {

	           /* put this writer in the “not shortlisted category” */

	       }

	    }

}
