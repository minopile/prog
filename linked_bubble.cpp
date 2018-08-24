#include<iostream>
using namespace std;

struct node {
	node * next=NULL;
	int val;
};

struct node * nNode(int val){
	node* head=new node;
	head->val=val;
	return head;
}

struct node* newNode(int val,node* head){
	if(head==NULL) 
	return nNode(val);
	else 
	head->next=newNode(val,head->next);
	return head;
}


int main(){
	int arr[]={2,4,6,8,3,1,7};
	node* head=new node;
	for(int i=0;i<7;i++)
	head=newNode(arr[i],head);
//	head=newNode(23,head);

while(head->next!=NULL) 
	{head=head->next;
		cout<<head->val<<" ";
		
		}
	return 0;
}