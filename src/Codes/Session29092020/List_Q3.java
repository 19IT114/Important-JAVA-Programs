package Session29092020;

import java.io.*;
import java.util.*;
public class List_Q3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a String -> ");
        String s = br.readLine();
        Stack<Character> stack = new Stack<Character>();
        boolean balanced = true;
        int length = s.length();

        for(int i=0;i<length;i++)
        {
            char a = s.charAt(i);
            if(a == '[' || a=='(' || a=='{')
            {
                stack.push(a);
            }

            else if(a == ']' || a==')' || a=='}')
            {
                if(stack.empty())
                {
                    System.out.println("Pranthesis are not possible");
                    return;
                }
                char x = stack.pop();
                switch(x)
                {
                    case '{':
                    {
                        if(a != '}')
                        {
                            balanced = false;
                        }
                        break;
                    }
                    case '(':
                    {
                        if(a != ')')
                        {
                            balanced = false;
                        }
                        break;
                    }
                    case '[':
                    {
                        if(a != ']')
                        {
                            balanced = false;
                        }
                        break;
                    }
                }

                if(!balanced )
                {
                    System.out.println("Paranthesis are not balanced");
                    break;
                }
            }
        }

        if(balanced)
        {
            System.out.println("Paranthesis are  balanced");
        }

    }
}
