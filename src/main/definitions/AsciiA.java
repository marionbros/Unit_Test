package main.definitions;

import java.util.ArrayList;

public class AsciiA extends Letters {

		public AsciiA () {
			this.realLetter ="A";
			this.pattern1 = generatePattern1();
		    this.pattern2 = generatePattern2();
		
		}

		public ArrayList<String> generatePattern1() {
			ArrayList<String> res  = new ArrayList<String>();

			res.add(" #  ");
			res.add("# # ");
			res.add("### ");
			res.add("# # ");
			res.add("# # ");

			return res;
		}

		public ArrayList<String> generatePattern2() {
			ArrayList<String> res = new ArrayList<String>();

			res.add("  ##   ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("###### ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");
			res.add("#    # ");

			return res;
		}
	


			
}
