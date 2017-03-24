package multiThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CurrentPakegeTest {
	CountDownLatch cdl = new CountDownLatch(3);
	CyclicBarrier cb = new CyclicBarrier(5);
}
