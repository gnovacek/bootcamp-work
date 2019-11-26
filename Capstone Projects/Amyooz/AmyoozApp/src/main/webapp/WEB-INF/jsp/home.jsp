<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="Common/header.jsp" %>

<body>

    <div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1 class="display-4">Welcome to Amyooz</h1>
			<p class="lead">Your Park, Your Way
                <br>Find the fun that is right for you!</p>
        <p>Already a member?</p>
			<button type="button" class="btn btn-primary">Sign in</button>
		</div>
	</div>

    <section class="main">
            <h2>Create Your Customized Profile</h2>

            <c:url var="registrationUrl" value="/home"/>

<form method="POST" action="${registrationUrl }" modelAttribute="registration">

    <h5>My Stats:</h5>
	<label for="firstName"> First Name: </label>
	<input type="text" name="firstName" placeholder="Enter your first name"/>
    <br>

    <label for="lastName"> Last Name: </label>
	<input type="text" name="lastName" placeholder="Enter your last name"/>
    <br>

    <label for="height"> How tall are you? </label>
	<input type="text" name="height" placeholder="Height in inches"/>

    <br>
    <label for="pregnant">Are you Pregnant?</label>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="pregnancyOptions" id="pregnant" value="yes">
        <label class="form-check-label" for="pregnant">Yes</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="pregnancyOptions" id="pregnant" value="no">
        <label class="form-check-label" for="pregnant">No</label>
      </div>


	<br><br>
    <h5>Need for Speed:</h5>
    
    <label for="speed">Select fastest speed you are comfortable with: </label>
    <br>
	    <select name="speed">
            <option value="1">1 - Slowest Possible Ride</option>
            <option value="2">2 - Slow Speed, like the MerryGoRound</option>
            <option value="3">3 - Slow Speed</option>
            <option value="4">4 - Medium Speed, like the Swings</option>
            <option value="5">5 - Medium Speed</option>
            <option value="6">6 - Medium Speed</option>
            <option value="7">7 - Fast Speed, like a Rollercoaster</option>
            <option value="8">8 - Fast Speed</option>
            <option value="9">9 - Fast Speed</option>
            <option value="10">10 - Fastest Ride of all time!</option>
        </select> 
    <br><br>

    <h5>Things I Like:</h5>
    <label for="waterRide">Water Rides?</label>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="waterRideOptions" id="waterRide" value="yes">
        <label class="form-check-label" for="waterRide">Yes</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="waterRideOptions" id="waterRide" value="no">
        <label class="form-check-label" for="waterRide">No</label>
      </div>
      <br>

    <label for="rollercoaster">Rollercoasters?</label>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="rollercoasterOptions" id="rollercoaster" value="yes">
        <label class="form-check-label" for="rollercoaster">Yes</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="rollercoasterOptions" id="rollercoaster" value="no">
        <label class="form-check-label" for="rollercoaster">No</label>
      </div>
      <br>

    <label for="upsideDown">Going Upside Down?</label>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="upsideDownOptions" id="upsideDown" value="yes">
        <label class="form-check-label" for="upsideDown">Yes</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="upsideDownOptions" id="upsideDown" value="no">
        <label class="form-check-label" for="upsideDown">No</label>
      </div>
      <br>

    <label for="twisted">Twists and Turns?</label>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="twistedOptions" id="twisted" value="yes">
        <label class="form-check-label" for="twisted">Yes</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="radio" name="twistedOptions" id="twisted" value="no">
        <label class="form-check-label" for="twisted">No</label>
      </div>
      <br>

      <label for="scary">Scary Rides?</label>
      <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="scaryOptions" id="scary" value="yes">
          <label class="form-check-label" for="scary">Yes</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="scaryOptions" id="scary" value="no">
          <label class="form-check-label" for="scary">No</label>
        </div>
        <br>

      <label for="freefallDrop">Free Fall Drops?</label>
      <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="freefallDropOptions" id="freefallDrop" value="yes">
          <label class="form-check-label" for="freefallDrop">Yes</label>
        </div>
        <div class="form-check form-check-inline">
          <input class="form-check-input" type="radio" name="freefallDropOptions" id="freefallDrop" value="no">
          <label class="form-check-label" for="freefallDrop">No</label>
        </div>
        <br>

        <label for="kidFriendly">Kid-friendly Rides?</label>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="kidFriendlyOptions" id="kidFriendly" value="yes">
            <label class="form-check-label" for="kidFriendly">Yes</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="kidFriendlyOptions" id="kidFriendly" value="no">
            <label class="form-check-label" for="kidFriendly">No</label>
          </div>
          <br>

          <label for="nostalgic">Nostalgic Rides?</label>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="nostalgicOptions" id="nostalgic" value="yes">
            <label class="form-check-label" for="nostalgic">Yes</label>
          </div>
          <div class="form-check form-check-inline">
            <input class="form-check-input" type="radio" name="nostalgicOptions" id="nostalgic" value="no">
            <label class="form-check-label" for="nostalgic">No</label>
          </div>
          <br>
   
<br>
	<input class="btn btn-primary" type="submit" value="Submit"/>

</form>
    </section>
 
</body>
</html>

<%@ include file="Common/footer.jsp" %>