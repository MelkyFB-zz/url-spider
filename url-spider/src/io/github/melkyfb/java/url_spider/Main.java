package io.github.melkyfb.java.url_spider;

import java.io.PrintStream;

import org.apache.commons.validator.routines.UrlValidator;

public class Main {
	private static PrintStream out = System.out;
	public static void main(String[] args) {		
		boolean show_usage = args.length == 0 || args[0] == "-h" || args[0] == "--help";
		if(show_usage) {
			showUsage();
		} else {
			UrlValidator urlValidator = new UrlValidator();
			if(urlValidator.isValid(args[args.length-1])) {
				int mdepth = 3;
				String opath = "";
				for(String arg : args) {
					if(arg.contains("--maxdepth=")) mdepth = Integer.parseInt(arg.replace("--maxdepth=", ""));
					if(arg.contains("-o=")) opath = arg.replace("-o=", "");
					if(arg.contains("--output=")) opath = arg.replace("--output=", "");
				}
				String surl = args[args.length-1];
				out.println("JAVA URL Spider++++++++++++++++++++++++++++");
				out.println("wrote by melkysalem at gmail dot com\n\n");
				out.println("URL Spider Started...");
				out.println("URL: "+surl);		
				out.println("Max Depth: "+mdepth);	
				if(opath.length()>0) out.println("Output Path: "+opath);
				else out.println("Output to console");
			} else {
				out.println(args[args.length-1]+" is not a valid url, please check that and try again");
				out.println("use only -h or --help argument to show usage");
			}
		}
	}
	private static void showUsage() {
		String usage = "URL Spider - A Web Spider";
		usage 		+= "Usage:";
		usage		+= "";
		usage		+= "java -jar url_spider.jar <options> url";
		usage		+= "";
		usage		+= "Options:";
		usage		+= "--maxdepth=N (N default=3) catch N depth for url";
		usage		+= "-o=PATH --output=PATH (Default to console) write to an output file ";
		usage		+= "-h --help show this usage";
		usage		+= "";
		usage		+= "wrote by melkysalem at gmail dot com";
		usage		+= "https://melkyfb.github.io/";
		out.println(usage);
	}

}
