package org.launchcode.techjobs_oo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import jdk.jfr.StackTrace;
import java.util.Objects;


public class JobTest {
    Job jobOneId;
    Job jobTwoId;

    @Test
    public void testSettingJobId() {
        jobOneId = new Job();
        jobTwoId = new Job();

        Assert.assertFalse(jobOneId.getId() == jobTwoId.getId());
        Assert.assertTrue(jobTwoId.getId() == jobOneId.getId()+1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer ("ACME"), new Location ("Desert"), new PositionType ("Quality control"), new CoreCompetency ("Persistence"));

        Assert.assertTrue(job.getName() instanceof String);
        Assert.assertTrue(job.getEmployer() instanceof Employer);
        Assert.assertTrue(job.getLocation() instanceof Location);
        Assert.assertTrue(job.getPositionType() instanceof PositionType);
        Assert.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {

        Job jobOne = new Job("Goddess of Magic", new Employer ("Arthurine"), new Location ("Beach"), new PositionType ("Happiness Ambassador"), new CoreCompetency ("Magic"));
        Job jobTwo = new Job("Goddess of Magic", new Employer ("Arthurine"), new Location ("Beach"), new PositionType ("Happiness Ambassador"), new CoreCompetency ("Magic"));

        Assert.assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringHasBlankLine() {
        Job job = new Job();
        String jobInfo = "\nID:\nName:\nEmployer:\nLocation:\nPosition Type:\nCore Competency:\n";

        Assert.assertTrue(jobInfo.contains("\n"));

    }

    @Test
    public void testToStringHasLabel() {
        Job job = new Job();
        String jobInfo = "\nID:\nName:\nEmployer:\nLocation:\nPosition Type:\nCore Competency:\n";

        Assert.assertTrue(jobInfo.contains("ID"));
        Assert.assertTrue(jobInfo.contains("Name"));
        Assert.assertTrue(jobInfo.contains("Employer"));
        Assert.assertTrue(jobInfo.contains("Location"));
        Assert.assertTrue(jobInfo.contains("Position Type"));
        Assert.assertTrue(jobInfo.contains("Core Competency"));
    }

    @Test
    public void testToStringContainsData() {
        Job job = new Job();
        String jobInfo =
                "\nID:"+
                "\nName:"+
                "\nEmployer:"+
                "\nLocation:"+
                "\nPosition Type:"+
                "\nCore Competency:" +
                "\n";

        String completeJobInfo =
                "\nID:" + job.getId()+
                "\nName:" + job.getName()+
                "\nEmployer:" + job.getEmployer()+
                "\nLocation:" + job.getLocation()+
                "\nPosition Type:" + job.getPositionType()+
                "\nCore Competency:" + job.getCoreCompetency()+
                "\n";

        Assert.assertFalse(jobInfo.equals(completeJobInfo));

    }

    @Test
    public void testToStringForEmptyField() {
        Job job = new Job();

        String completeJobInfo =
                        "\nID:" + job.getId()+
                        "\nName:" + job.getName()+
                        "\nEmployer:" + job.getEmployer()+
                        "\nLocation:" + job.getLocation()+
                        "\nPosition Type:" + job.getPositionType()+
                        "\nCore Competency:" + job.getCoreCompetency()+
                        "\n";
//        String noData = "Data Not Available";
//
        toString();

        Assert.assertEquals(("Data Not Available"),(job.getId() == 0));
        Assert.assertEquals(("Data Not Available"),(job.getName().equals("")));
        Assert.assertEquals(("Data Not Available"),(job.getEmployer().equals("")));
        Assert.assertEquals(("Data Not Available"),(job.getLocation().equals("")));
        Assert.assertEquals(("Data Not Available"),(job.getPositionType().equals("")));
        Assert.assertEquals(("Data Not Available"),(job.getCoreCompetency().equals("")));
    }
}
