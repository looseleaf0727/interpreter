package newlang8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Block extends Node{
    static Node isMatch(Environment env, LexicalUnit first) {//isMatchの中で場合分け
        Node node = IFNode.isMatch(env,first);//ifnodeにMatchするか
        if(node != null) return node;//null以外ならnodeを返す
        node = Loopblock.isMatch(env, first);
        if(node != null) return node;//null以外ならnodeを返す
        return node;
    }
    
    @Override
    public boolean Parse(){
        return false;
    }

    @Override
    public String toString() {
        return "test";
    }

    @Override
    public Value getValue() {
        return super.getValue(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
