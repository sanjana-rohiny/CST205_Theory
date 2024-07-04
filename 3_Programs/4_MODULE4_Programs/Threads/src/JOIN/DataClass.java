package JOIN;

public class DataClass {
	
	private String data;

    public void produceData() {
        // Simulate data production
        data = "In the beginning God created the heavens and the earth...!";
    }

    public String consumeData() {
        // Simulate data consumption
        return data;
    }
}
