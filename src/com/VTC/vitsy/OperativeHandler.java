package com.VTC.vitsy;

public class OperativeHandler {
	private static boolean operating = true;
	public static String doOperation(String operator) {
		switch (operator) {
		case "1": return "1";
		case "2": return "2";
		case "3": return "3";
		case "4": return "4";
		case "5": return "5";
		case "6": return "6";
		case "7": return "7";
		case "8": return "8";
		case "9": return "9";
		case "a": return "a";
		case "b": return "b";
		case "c": return "c";
		case "d": return "d";
		case "e": return "e";
		case "f": return "f";
		case "0": return "0";
		case "w": return "wait";
		case ")": return "ifnot";
		case "(": return "if";
		case "!": return "skip";
		case "[": return "loop";
		case "S": return "sine";
		case "C": return "cosine";
		case "T": return "tangent";
		case "P": return "pi";
		case "E": return "E";
		case "L": return "log";
		case "N": return "outnum";
		case "O": return "outchar";
		case "R": return "rand";
		case ";": return "end";
		case "#": return "teleport";
		case "r": return "reverse";
		case "}": return "rotateright";
		case "{": return "rotateleft";
		case "D": return "duplicate";
		case "+": return "add";
		case "-": return "subtract";
		case "*": return "multiply";
		case "/": return "divide";
		case "M": return "modulo";
		case "^": return "power";
		case "|": return "changedir";
		case "<": return "goleft";
		case ">": return "goright";
		case "x": return "randdir";
		case " ": return "nothing";
		case "\"": return "quote";
		}
		return "err";
	}
	public static boolean operating() {
		return operating;
	}
}