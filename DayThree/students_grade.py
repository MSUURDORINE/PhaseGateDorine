def get_scores(student_score, student, subject):

	for index in range(student):
		for count in range(subject): 
	
			scores = int (input("Enter students scores"))
			
			student_score[index][count] = scores




def get_total(student_score, student_index):
   
	total = 0;
   
	for index in range(len(student_score[student_index])):
   
		total += student_score[student_index][index]
  
   
	return total




student = int(input("Enter your students number: "))



subject = int(input("Enter number of your students subject: "))



student_score = []

for index in range(student):
	
	row = []
	
	for count in range (subject):
		print("sudent" , (index + 1))
		scores = int(input("Enter score: "))
		
		row.append(scores)
		
		student_score.append(row)




for index in range(student):

	total = get_total(student_score, index)

	print("Total is " , total )

