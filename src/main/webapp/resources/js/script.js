$(document).ready(function() {
	$("#perrosTable").DataTable({
		columnDefs: [{ targets: 'no-sort', orderable: false }],
		responsive: true
	});
	
	$(".eliminarBtn").click(function() {
		$("#eliminarModal #eliminarId").val($(this).data("id"));
	});
});