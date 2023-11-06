CPATH='.:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar'

rm -rf student-submission
rm -rf grading-area

mkdir grading-area

git clone $1 student-submission
echo "finished cloning"

path=`find student-submission -name ListExamples.java`

if [[ -e $path ]]
then
    echo "ListExamples.java found"
else
    echo "ListExamples.java not found"
    exit
fi

cp -r student-submission/ListExamples.java grading-area
cp -r TestListExamples.java grading-area

javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java
java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore TestListExamples

# Draw a picture/take notes on the directory structure that's set up after
# getting to this point

# Then, add here code to compile and run, and do any post-processing of the
# tests