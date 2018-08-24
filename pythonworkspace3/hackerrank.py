if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        a=input().split(' ')
        student_marks[a[0]]=[float(x) for x in a[1:]]
    student_name=input()
    avg=sum(student_marks[student_name])
    
    avg=avg/3
    print('%.2f' % avg)
    