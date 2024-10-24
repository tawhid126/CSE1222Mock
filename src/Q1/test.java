package Q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    public void testWorkerToString() {
        Worker worker = new Worker("Khaled", 50000);
        String expected = "Worker{name='Khaled', salary=50000.0}";
        assertEquals(expected, worker.toString());
    }
    @Test
    public void testSupervisorToString1() {
        Supervisor worker = new Supervisor("Alice", 50000 , "service");
        String expected = "{Worker{name='Alice', salary=50000.0} {divisionName='service'}";
        assertEquals(expected, worker.toString());
    }

}

