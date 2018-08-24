#include<stdio.h>
struct nodel
{
    int data;
    struct nodel *next;
};
int main()
{
    struct nodel *head = node(1);
    head->next = node(2);
    head->next->next = node(2);
    head->next->next->next = node(4);
    head->next->next->next->next = node(5);
    head->next->next->next->next->next = node(6);
    head->next->next->next->next->next->next = node(7);
    head->next->next->next->next->next->next->next = node(8);

    reverse(&head);

    return 0;
}
void reverse (struct nodel** Head)
{
    struct nodel* temp,*temp1;
    struct nodel * head=*Head;
    temp=head;
    head=head->next;
    temp->next=NULL;
    while(head->next!=NULL)
    {
        temp1=head;
        head=head->next;
        temp1->next=temp;
        temp=temp1;
    }
    head->next=temp;
    while(head->next!=NULL)
    {
        printf("%d",head->data);
    }
}
