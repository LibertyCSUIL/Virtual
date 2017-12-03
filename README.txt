HOWTO Submit virtual assignments
--------------------------------

Step One, clone and cd into directory:

(don't clone if you've already done so previously)
git clone https://github.com/LibertyCSUIL/Virtual.git
cd ~/Programming\ Team/Github\ repos/Virtual/


Step Two, update the repository:

git pull


Step Three, create and enter into your named working directory:

EXAMPLE: mkdir 2017/GavinD/

(don't create the directory if it already exists)
mkdir <year>/<name>/
cd <year>/<name>/


Step Four, copy Java virutal assignment into current directory:

cp ~/Virtual/assignments/<assignment.java> $PWD


Step Five, complete assignment.


Step Six, add the virtual assignment to the repository:

git add <assignment.java>


Step Seven, commit the name of the homework with the date and time:

EXAMPLE: git commit -m "VarSum, 07/02/2017 06:27PM"

git commit -m "<assignment>, <date> <time>"


Step Eight, push changes:

git push origin master



REPEAT EVERY TIME 

(Grades will be posted as <assignment.txt> in your named directory)
