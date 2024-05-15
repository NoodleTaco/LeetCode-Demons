using System;
public class Solution {
    public string Interpret(string command) {
        String interpretedVer = "";
        for(int i = 0 ; i < command.Length;){
            if(command[i] == '('){
                if(command[i+1] == ')'){
                    interpretedVer += "o";
                    i += 2;
                }
                else{
                    interpretedVer += "al";
                    i += 4;
                }
            }
            else{
                interpretedVer += "G";
                i++;
            }
        }
        return interpretedVer;
    }
}