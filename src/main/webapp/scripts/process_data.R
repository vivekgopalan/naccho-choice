# to convert Places2k.txt file to UTF-8 format
#http://www.census.gov/geo/www/gazetteer/places2k.html
#iconv  -t utf-8 -f iso-8859-1 ~/Desktop/places2k.txt > ~/Desktop/places2k_utf8.txt 

#source("/Users/vivek/Workspaces/Eclipse/Naccho/src/main/webapp/scripts/process_data.R")
rm(list = ls())
project_home="/Users/vivek/Workspaces/Eclipse/Naccho";

data_file= file.path(project_home,"src/main/webapp/data/profile2008subset_fips_final-4.csv");
place_file= file.path(project_home,"src/main/webapp/data/places2k_utf8.txt");
rdata_file =file.path(project_home,"src/main/webapp/data/processed_data.RData");


y=read.table(data_file,sep=",",nrows=1,header=TRUE);
x=read.table(data_file,sep=",",skip=2,header=FALSE);

colnames(x)=colnames(y);
characteristics=names(y[which(y=="CI")]);
indicators=names(y[which(y=="I")]);

x$sstate_std = paste("US-",x$sstate,sep="")
scity=as.character(x$scity);

aggregate(subset(x,select=c("Numeric_Value")),subset(x,select=c("module")),length)


# Read census data
aa=read.fwf(place_file,widths=c(2,2,5,64,9,9,14,14,12,12,10,11));
# Trim empty spaces in the end of the places names
aa[,4] = gsub("\\s*$","",as.character(aa[,4]))
aa[,4] = gsub("Mount","Mt.",as.character(aa[,4]))

# Trim the last word (city, village, etc) from the places field
geo_data=data.frame(sstate_std = paste("US-",aa[,1],sep=""), scity=sub("\\s\\S*$","",aa[,4]),lat=aa[,11],long=aa[,12])
geo_data= merge(x,geo_data,all.x=TRUE)[,c("lat","long","scity","sstate")];
rm(aa)

save.image(file=rdata_file);
