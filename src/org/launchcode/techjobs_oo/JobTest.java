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
    @Before
    public void testSettingJobId() {
        jobOneId = new Job();
        jobTwoId = new Job();

        Assert.assertFalse(jobOneId.getId() == jobTwoId.getId());
        Assert.assertTrue(jobTwoId.getId() == jobOneId.getId()+1);
    }

    @Test
    @Before
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer ("ACME"), new Location ("Desert"), new PositionType ("Quality control"), new CoreCompetency ("Persistence"));

        Assert.assertTrue(job.getName() instanceof String);
        Assert.assertTrue(job.getEmployer() instanceof Employer);
        Assert.assertTrue(job.getLocation() instanceof Location);
        Assert.assertTrue(job.getPositionType() instanceof PositionType);
        Assert.assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    @Before
    public void testJobsForEquality() {

        Job jobOne = new Job("Goddess of Magic", new Employer ("Arthurine"), new Location ("Beach"), new PositionType ("Happiness Ambassador"), new CoreCompetency ("Magic"));
        Job jobTwo = new Job("Goddess of Magic", new Employer ("Arthurine"), new Location ("Beach"), new PositionType ("Happiness Ambassador"), new CoreCompetency ("Magic"));

        Assert.assertFalse(jobOne.equals(jobTwo));
    }
}
