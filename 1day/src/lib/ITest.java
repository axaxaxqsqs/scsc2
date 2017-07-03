package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public interface ITest {
	void makeTest(ArrayList<String> unsort);
	HashMap<String, String> doTest(List<String> nameList);
	String checkPass(LinkedList<String> answerSheet);
}
