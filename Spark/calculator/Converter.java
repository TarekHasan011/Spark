// 
// Decompiled by Procyon v0.5.36
// 

package calculator;

import java.util.Stack;
import java.util.HashMap;

public class Converter
{
    public String infix;
    
    public Converter(final String infix) {
        this.infix = infix;
    }
    
    public String insertBrackets() {
        this.infix = this.addChar(this.infix, '(', 0);
        for (int i = 1; i != this.infix.length(); ++i) {
            if (this.infix.charAt(i) == '+' || this.infix.charAt(i) == '-' || this.infix.charAt(i) == '*' || this.infix.charAt(i) == '/') {
                this.infix = this.addChar(this.infix, ')', i);
                this.infix = this.addChar(this.infix, '(', i + 2);
                i += 2;
            }
        }
        return this.infix = this.addChar(this.infix, ')', this.infix.length());
    }
    
    public String addChar(final String str, final char ch, final int position) {
        final StringBuilder sb = new StringBuilder(str);
        sb.insert(position, ch);
        return sb.toString();
    }
    
    public String postfix() {
        final HashMap<Character, Integer> operator_priority = new HashMap<Character, Integer>();
        final Stack<Character> operator = new Stack<Character>();
        operator_priority.put('*', 2);
        operator_priority.put('/', 2);
        operator_priority.put('+', 1);
        operator_priority.put('-', 1);
        String postfix = "";
        for (int i = 0; i != this.infix.length(); ++i) {
            if ((this.infix.charAt(i) >= '0' && this.infix.charAt(i) <= '9') || this.infix.charAt(i) == '(' || this.infix.charAt(i) == ')' || this.infix.charAt(i) == '.') {
                postfix = String.valueOf(postfix) + this.infix.charAt(i);
            }
            else if (operator.empty()) {
                operator.push(this.infix.charAt(i));
            }
            else {
                while (operator_priority.get(operator.peek()) >= operator_priority.get(this.infix.charAt(i))) {
                    postfix = String.valueOf(postfix) + operator.peek();
                    operator.pop();
                    if (operator.empty()) {
                        break;
                    }
                }
                operator.push(this.infix.charAt(i));
            }
        }
        while (!operator.empty()) {
            postfix = String.valueOf(postfix) + operator.peek();
            operator.pop();
        }
        return postfix;
    }
    
    public static double calculate_postfix(final String postfix) {
        final Stack<Double> calculate = new Stack<Double>();
        for (int i = 0; i != postfix.length(); ++i) {
            if (postfix.charAt(i) == '(') {
                String tempString = "0";
                int j;
                for (j = i + 1; postfix.charAt(j) != ')'; ++j) {
                    tempString = String.valueOf(tempString) + postfix.charAt(j);
                }
                calculate.push(Double.parseDouble(tempString));
                i = j;
            }
            else {
                final double b = calculate.peek();
                calculate.pop();
                final double a = calculate.peek();
                calculate.pop();
                if (postfix.charAt(i) == '+') {
                    calculate.push(a + b);
                }
                else if (postfix.charAt(i) == '-') {
                    calculate.push(a - b);
                }
                else if (postfix.charAt(i) == '*') {
                    calculate.push(a * b);
                }
                else if (postfix.charAt(i) == '/') {
                    calculate.push(a / b);
                }
            }
        }
        return calculate.peek();
    }
    
    public double calculate() {
        this.insertBrackets();
        final String postfix = this.postfix();
        return calculate_postfix(postfix);
    }
}
