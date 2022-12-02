name<-c("Saswata da","Dipanjan","sangita di","Babai da","Papai da","Chayanika di","Mriganko vai","Diganta")
age<-c(21,26,23,26,32,27,24,22)
colors<-c("blue","yellow","green","black","red","white")
pie(age,label=name,main="Family",col =colors)

#Display the Explanation box
legend("bottomright",name,fill=colors)
