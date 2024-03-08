$(document).ready(function(){
    $(".checkbox-trigger").change(function() {
      var targets = $(this).data('bs-target').split(' '); // Get an array of target IDs
      var isChecked = this.checked; // Get the checkbox state

      // Loop through each target
      targets.forEach(function(target) {
        if (isChecked) {
          $(target).prop("disabled", false); // Enable the target element
        } else {
          $(target).prop("disabled", true); // Disable the target element
        }
      });
    });
  });

  function selectDirectory() {
    window.showDirectoryPicker().then((directoryHandle) => {
      const directoryName = directoryHandle.name;
      const selectedDirectoryText = document.getElementById('selectedDirectoryText');
      selectedDirectoryText.textContent = 'Directory: ' + directoryName;
      selectedDirectoryText.classList.remove('danger'); // Remove the "danger" class
    }).catch((error) => {
      console.error('Error selecting directory:', error);
    });
  }

  $(document).ready(function() {
    // Event listener for the "Generate Message" button
    $("#generateMessageButton").click(function() {
      // Gather all form data
      var formData = gatherFormData();

      // Send form data to the backend
      sendFormData(formData);
    });
  });


  // Function to gather all form data
  function gatherFormData() {
    var formData = {};
    // Iterate over form inputs and store their values in the formData object
    $("input, select").each(function() {
      formData[$(this).attr("id")] = $(this).val();
    });
    return formData;
  }

  // Function to send form data to the backend
  function sendFormData(formData) {
    console.log("Form data to be sent:", formData); // Log the JSON data
    $.ajax({
      type: "POST",
      url: "/orders/processOrder",
      data: JSON.stringify(formData),
      contentType: "application/json",
      success: function(response) {
        console.log("Form data sent successfully:", response);
        // Optionally, display a success message or redirect the user
      },
      error: function(xhr, status, error) {
        console.error("Error sending form data:", error);
        // Optionally, display an error message to the user
      }
    });
  }



