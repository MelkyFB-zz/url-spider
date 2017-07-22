package io.github.melkyfb.java.url_spider;

import org.apache.commons.validator.routines.UrlValidator;

public class Main {

	public static void main(String[] args) {		
		boolean show_usage = args.length == 0 || args[0] == "-h" || args[0] == "--help";
		if(show_usage) {
			showUsage();
		} else {
			UrlValidator urlValidator = new UrlValidator();
			if(urlValidator.isValid(args[args.length-1])) {
				
			} else {
				System.out.println(args[args.length-1]+" is not a valid url, please check that and try again\n");
				System.out.println("use only -h or --help argument to show usage\n");
			}
		}
	}
	private static void showUsage() {
		String usage = "URL Spider - A Web Spider\n";
		usage 		+= "Usage:\n";
		usage		+= "\n";
		usage		+= "java -jar url_spider.jar <options> url\n";
		usage		+= "\n";
		usage		+= "Options:\n";
		usage		+= "-maxdepth=N (N default=3) catch N depth for url\n";
		usage		+= "-o (Default to output) write to an output file \n";
		usage		+= "-h --help show this usage\n";
		usage		+= "\n";
		usage		+= "wrote by melkysalem at gmail dot com\n";
		usage		+= "https://melkyfb.github.io/\n";
		System.out.println(usage);
	}

}
