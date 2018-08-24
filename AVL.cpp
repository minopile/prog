#include<iostream>
using namespace std;
struct node{
	int val;
	int ht;
	node * left=NULL;
	node *right=NULL;
};

int main(){
	node *head=new node;
	
	
	
	return 0;
}

void insert(int val,node * root){
	if(root==NULL) return newNode(val);
	if(root->val>val) return insert(val,root->left);
	if(root->val<val) return insert(val,root->right);

	
}