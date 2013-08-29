<%
	ui.includeCss("coreapps", "patientdashboard/patientDashboard.css")
%>

<div id="most-recent-vitals-container" class="in collapse">
    Loading...
</div>

<script type="text/javascript"/>
	if (${encounterId}) {
		emr.getFragmentActionWithCallback("htmlformentryui", "htmlform/viewEncounterWithHtmlForm", "getAsHtml", { encounterId: ${encounterId} }, function(result) {
		    jq('#most-recent-vitals-container').html(result.html);
		});
	}
	else {
		jq('#most-recent-vitals-container').html('');
	}
</script>