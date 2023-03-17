/**
 * 
 */
function send(f){
	let title = f.title.value;
	let writer = f.writer.value;
	let email = f.email.value;
	let qna_contents = f.qna_contents.value;
	
	f.action = "";
	f.submit();
	
}
