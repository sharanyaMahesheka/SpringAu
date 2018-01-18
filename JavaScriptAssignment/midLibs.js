var name = prompt('Please enter your name');
var word1 = prompt('Please give the first word');
var word2 = prompt('Please give the second word');
var word3 = prompt('Please give the third word');
var word4 = prompt('Please give the fourth word');
var word5 = prompt('Please give the fifth word');
var color = prompt('Please choose one of the following color: Aqua, Black, Blue, Fuchsia, Gray, Green, Lime, Maroon, Navy, Olive, Purple, Red, Silver, Teal, White, Yellow');


var sentence = "<br><h2>Green Eggs And Ham</h2><br><h3>You do not like green eggs and ham? <div  style=\"display:inline;background:"+color+"\" >"+word1+"</div>";
sentence+=" I  not like<div  style=\"display:inline; background:"+color+"\" >"+word1+"</div>";
sentence+=" ,  Sam-I-am. <div  style=\"display:inline; background:"+color+"\" >"+word1+"</div>";
sentence+="Could you, would you, with a<div  style=\"display:inline;background:"+color+"\" >"+word1+"</div>";
sentence+=" I would not, could not, with a goat!Would<div  style=\"display:inline;background:"+color+"\" >"+word1+"</div>";
document.write(sentence);

