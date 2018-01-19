var countRow;
function checkMode(){
	countRow = 0;
	var checkedValue = document.getElementById('NAMode').checked;
	document.getElementById('male').checked=false;
	document.getElementById('female').checked=false;
	document.getElementById('inputText').value="";
	document.getElementById('name').value="";
	
	if(checkedValue){
		document.getElementById('numberMode').style.display = 'none'; //Will hide
		document.getElementById('nameMode').style.display = 'block'; //Will show
	} else{
		document.getElementById('nameMode').style.display = 'none'; //Will hide
		document.getElementById('numberMode').style.display = 'block'; //Will show
	}
}

// It analyzes the input and display result accordingly as string or number
function numberMode(){
	var input = document.getElementById('inputText').value;
	var resultText;
	
	if(input!=""){
		if (isNaN(input))
			displayName(input);
		else 
			evaluateNumber(input)
	} 
	else
		document.getElementById('result').innerHTML="";
}
			
//Display the input name with a statement
function displayName(input) {
	var resultText = 'Your name is '+ input;
	document.getElementById('result').innerHTML=resultText;
	
}

//Analyzes the range of the input number and displays accordingly
function evaluateNumber(input) {
	if (input>0 && input<1000){
			if (input<50)
				resultText = 'Number is less than 50'; 
			else if (input>=50 && input<100)
				resultText = 'Number is greater than 50 and less than 100';
			else 
				resultText = 'Number is above 100';
	}
	else 
		resultText = 'Number is invalid';
	
	document.getElementById('result').innerHTML=resultText;
}

function nameAgeMode(){
	var isMale = document.getElementById('male').checked;
	var isFemale = document.getElementById('female').checked;
	
	var title;
	var gender;
	if(isMale)
	{
		title="Master";
		gender = "Male"
	}
	else {
		title="Miss";
		gender="Female";
	}
		
	var name = document.getElementById('name').value;
	var details = "Your name is "+title+" "+name; 
	var table =  document.getElementById('userDetails');
	if( !(/^[A-z ]+$/.test(name))){
		alert("Please enter the valid name");
		return;
	}
	if(!isMale && !isFemale){
		alert("Please enter the gender");
		return;
	}
		
	document.getElementById('displayDetails').innerHTML=details;
	if(countRow==0)
	{
		var row = table.insertRow(countRow);
		var cell1 = row.insertCell(0);
		var cell2 = row.insertCell(1);
		var cell3 = row.insertCell(2);
		var cell4 = row.insertCell(3);
		cell1.innerHTML="S.No";
		cell2.innerHTML="Name";
		cell3.innerHTML="Gender";
		cell4.innerHTML="Details";
	}
	var row = table.insertRow(++countRow);
	var cell1 = row.insertCell(0);
	var cell2 = row.insertCell(1);
	var cell3 = row.insertCell(2);
	var cell4 = row.insertCell(3);
	cell1.innerHTML=countRow;
	cell2.innerHTML=name;
	cell3.innerHTML=gender;
	cell4.innerHTML=details;
}


