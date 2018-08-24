tic
display 'phase variables ';
d1=dir('E:\matlab\pTrain\*.png');
d2=dir('E:\matlab\nTrain\*.png');


pTr=length(d1);
nTr=length(d2);
N=pTr+nTr;
train_x=zeros(28,28,N);
train_y=zeros(2,N);
toc

display 'phase positive '
%% Get Feature Vectors of all Training and Testing Images
cnt=1;

for i=1:pTr
    fn=strcat('E:\matlab\pTrain\',d1(i).name);
    %fn=d1(i).name;
    %I=rgb2gray(imread([f1, '/', fn]));
    
    I=imread(fn);
    I=imresize(I,[28,28]);
    if(length(size(I))==3)%implies that image is RGB
        I2=single(rgb2gray(I));
    else %implies that image is grayscale
        I2=single(I);
    end
    %I2 = single(rgb2gray(I)) ;
	train_x(:,:,cnt)=I2;
	train_y(1,cnt)=1;
    cnt=cnt+1;
	end

toc

tic;display 'phase negative';
for i=1:nTr
    fn=strcat('E:\matlab\nTrain\',d2(i).name);
    %fn=d2(i).name;
    %I=rgb2gray(imread([f2, '/', fn]));
    
    I=imread(fn);
    I=imresize(I,[28,28]);
    if(length(size(I))==3)%implies that image is RGB
        I2=single(rgb2gray(I));
    else %implies that image is grayscale
        I2=single(I);
    end    
    
   train_x(:,:,cnt)=I2;
   train_y(2,cnt)=1;
    cnt=cnt+1;
end


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
tic;
display 'phase Test'

dt=dir('E:\matlab\test\*.png');
t=length(dt);

test_x=zeros(28,28,t);
test_y=zeros(2,t);


cnt=1;
for i=1:t
    fn=strcat('E:\matlab\test\',dt(i).name);
    I=imread(fn);
    I=imresize(I,[28,28]);
    if(length(size(I))==3)%implies that image is RGB
        I2=single(rgb2gray(I));
    else %implies that image is grayscale
        I2=single(I);
    end    
	test_x(:,:,cnt)=I2;
	test_y(1,cnt)=1;
    cnt=cnt+1;
end
    
toc  
