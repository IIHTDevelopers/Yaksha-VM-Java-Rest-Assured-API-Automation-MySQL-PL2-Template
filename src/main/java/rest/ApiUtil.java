package rest;

import java.util.Map;

import io.restassured.response.Response;

public class ApiUtil {

	private static final String BASE_URL = "https://healthapp.yaksha.com/api";

	/**
	 * @Test1 This method creates a new appointment with authorization.
	 * 
	 * @param endpoint - The API endpoint to which the request is sent.
	 * @param body     - A map containing the appointment details (FirstName,
	 *                 LastName, etc.).
	 * @description This method constructs a JSON payload from the given map, sends
	 *              a POST request to the specified endpoint with the authorization
	 *              header, and returns the response.
	 * @return Response - The response from the API after attempting to create the
	 *         appointment.
	 */
	public Response createAppointmentWithAuth(String endpoint, Map<String, String> body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test2 This method cancels an existing appointment with authorization.
	 * 
	 * @param endpoint - The API endpoint to which the request is sent for canceling
	 *                 the appointment.
	 * @param body     - An optional object representing the request body. This
	 *                 parameter can be null since the cancelation does not require
	 *                 a body payload.
	 * @description This method builds a PUT request with the authorization header
	 *              and specified endpoint. If a body is provided, it includes that
	 *              in the request; otherwise, it sends the request without a body.
	 * @return Response - The response from the API after attempting to cancel the
	 *         appointment.
	 */
	public Response cancelAppointmentWithAuth(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test3 This method searches for a patient using specified query parameters.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @description This method sends a GET request to the specified endpoint with
	 *              the necessary authorization header and query parameters to
	 *              search for a patient in the system. The API returns details of
	 *              patients matching the search criteria, including fields like
	 *              `PatientId`, `ShortName`, `FirstName`, `LastName`, `Age`, and
	 *              others.
	 *
	 * @return Response - The API's response after attempting to search for
	 *         patients, which includes the HTTP status code, status message, and a
	 *         list of matching patients in the "Results" field.
	 */
	public Response searchPatientWithAuth(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test4 This method retrieves a list of appointments for a specified performer
	 *        within a given date range.
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @description This method sends a GET request to retrieve all appointments for
	 *              a specified performer between `FromDate` and `ToDate`. The
	 *              request includes query parameters for date range and performer
	 *              ID, with necessary authorization headers. The API returns
	 *              details of matching appointments, including fields like
	 *              `AppointmentId`, `PatientId`, `FullName`, `AppointmentDate`,
	 *              `AppointmentTime`, `AppointmentStatus`, and other relevant
	 *              details.
	 *
	 * @return Response - The API's response, which includes the HTTP status code, a
	 *         status message, and a list of appointments in the "Results" field,
	 *         each containing appointment and patient details.
	 */
	public Response bookingListWithAuthInRange(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test5 This method retrieves details of the main store in the pharmacy
	 *        settings.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @description This method sends a GET request to the specified endpoint with
	 *              the necessary authorization header to fetch details of the main
	 *              store in the pharmacy settings. The API response provides store
	 *              details, including `Name`, `StoreDescription`, and `StoreId`.
	 *
	 *              The method validates that: 1. The API response status code is
	 *              200 (OK). 2. Essential fields `Name`, `StoreDescription`, and
	 *              `StoreId` are not null, ensuring the store details are
	 *              populated. 3. The `Status` field in the response is "OK",
	 *              confirming a successful response.
	 *
	 * @return Response - The API's response after attempting to retrieve main store
	 *         details, which includes the HTTP status code, status message, and the
	 *         store details in the "Results" field.
	 */
	public Response MainStoreDetailsWithAuth(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test6 This method retrieves a list of pharmacy stores and verifies the
	 *        details of each store.
	 *
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @description This method sends a GET request to the specified endpoint with
	 *              the necessary authorization header to retrieve details of
	 *              various pharmacy stores. The API response provides details such
	 *              as `StoreId` and `Name` for each store.
	 *
	 *              The method performs the following validations: 1. Confirms that
	 *              the API response status code is 200 (OK). 2. Iterates through
	 *              each store in the "Results" field to ensure that both `StoreId`
	 *              and `Name` are present and not null, verifying that each store
	 *              entry is valid. 3. Asserts that the `Status` field in the
	 *              response is "OK" to confirm a successful response.
	 *
	 * @return Response - The API's response after attempting to retrieve the list
	 *         of pharmacy stores, which includes the HTTP status code, status
	 *         message, and store details within the "Results" field.
	 */
	public Response PharmacyStoresWithAuth(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test7 This method activates a pharmacy counter using counter details from an
	 *        Excel sheet.
	 *
	 * @description This method retrieves counter information (ID and name) , sends
	 *              a GET request to activate the specified pharmacy counter, and
	 *              validates the response. The API endpoint includes query
	 *              parameters for `counterId` and `counterName`, and returns
	 *              details on the activated counter.
	 *
	 *              The method performs the following validations: 1. Asserts that
	 *              the API response status code is 200 (OK). 2. Checks the
	 *              `Results` field to confirm that `CounterName` and `CounterId`
	 *              are not null, ensuring the counter details are returned as
	 *              expected. 3. Verifies that the `Status` field is "OK" to confirm
	 *              a successful activation.
	 *
	 * @return Response - The API's response, which includes the HTTP status code,
	 *         status message, and details of the activated counter in the "Results"
	 *         field.
	 */
	public Response ActivatePharmCount(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test8 This method deactivates a pharmacy counter.
	 * @description This method sends a request to deactivate a pharmacy counter and
	 *              verifies the API response. The endpoint does not require query
	 *              parameters, and the response provides details of the
	 *              deactivation result, including a `StatusCode` and `Status`
	 *              field.
	 *
	 *              The method performs the following validations: 1. Asserts that
	 *              the API response status code is 200 (OK). 2. Checks the
	 *              `Results` field to confirm that `StatusCode` is "200", verifying
	 *              successful deactivation. 3. Verifies that the `Status` field is
	 *              "OK" to confirm the operation's success.
	 *
	 * @return Response - The API's response, which includes the HTTP status code,
	 *         status message, and deactivation details in the "Results" field.
	 */
	public Response DeactivatePharmCount(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test9 This method retrieves and verifies the list of appointment applicable
	 *        departments.
	 * @description This method sends a request to fetch all departments where
	 *              appointments are applicable, and validates the API response. The
	 *              method iterates through each department in the response,
	 *              checking essential department information.
	 *
	 *              The method performs the following validations: 1. Asserts that
	 *              the API response status code is 200 (OK). 2. Checks each item in
	 *              the `Results` list, ensuring `DepartmentId` and `DepartmentName`
	 *              fields are not null, confirming the department data's presence.
	 *              3. Verifies that the `Status` field is "OK" to indicate the
	 *              operation's success.
	 *
	 * @return Response - The API's response includes the HTTP status code, status
	 *         message, and a list of applicable departments in the "Results" field.
	 */
	public Response AppointApplicDept(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test10 This method retrieves and verifies the list of currently admitted
	 *         patients.
	 * 
	 * @description This method sends a request to fetch data on patients with an
	 *              "admitted" status, and validates the API response. It iterates
	 *              through each patient's data in the response, checking key
	 *              information such as PatientId and AdmittedDate.
	 *
	 *              The method performs the following validations: 1. Asserts that
	 *              the API response status code is 200 (OK). 2. For each patient in
	 *              the `Results` list: - Ensures `PatientId` and `AdmittedDate`
	 *              fields are not null, confirming patient data availability. -
	 *              Verifies that `DischargedDate` is null, indicating the patient
	 *              is currently admitted. 3. Verifies that the `Status` field in
	 *              the response is "OK" to confirm a successful operation.
	 *
	 * @return Response - The API response includes the HTTP status code, status
	 *         message, and a list of admitted patients in the "Results" field.
	 */
	public Response admittedPatientData(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test11 This method retrieves the profile details of patients with an
	 *         "admitted" status.
	 * 
	 * @description This method sends a request to fetch data on profile details of
	 *              the account user by Bearer token and returns the API response
	 *              containing the profile details.
	 *
	 * @param endpoint - The specific API endpoint to retrieve patient data.
	 * @param body     - The request body containing optional query parameters or
	 *                 filters, if applicable.
	 *
	 * @return Response - The API response includes the HTTP status code, status
	 *         message, and profile details of admitted patients in the "Results"
	 *         field.
	 */
	public Response getProfileDetails(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test12 @PL2 This method adds a new Department with description and other
	 *         details.
	 * 
	 * @param endpoint - The API endpoint to which the request is sent.
	 * @param body     - A map containing the currency details (DepartmentCode,
	 *                 DepartmentName, etc.).
	 * @description This method constructs a JSON payload from the given map, sends
	 *              a POST request to the specified endpoint with the authorization
	 *              header, and returns the response.
	 * @return Response - The response from the API after attempting to add a
	 *         currency.
	 */
	public Response addDepartment(String endpoint, Map<String, String> body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test13 @PL2 This method retrieves and verifies the list of departments.
	 * @description This method sends a request to fetch all departments and
	 *              validates the API response. The method iterates through each
	 *              department in the response, checking essential department
	 *              information.
	 *
	 *              The method performs the following validations: 1. Asserts that
	 *              the API response status code is 200 (OK). 2. Checks each item in
	 *              the `Results` list, ensuring `DepartmentId`, `DepartmentCode`,
	 *              and `DepartmentName` fields are not null, confirming the
	 *              department data's presence. 3. Verifies that the `Status` field
	 *              is "OK" to indicate the operation's success.
	 *
	 * @return Response - The API's response includes the HTTP status code, status
	 *         message, and a list of departments in the "Results" field.
	 */
	public Response getDepartmentsList(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test14_PL2 This method retrieves and verifies the list of signatories by
	 *             department.
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 *
	 * @return Response - The API response includes the HTTP status code, status
	 *         message, and a list of signatories in the "Results" field, containing
	 *         details such as EmployeeId, FirstName, and LastName.
	 */

	public Response editDepartmentDetails(String endpoint, Map<String, String> body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test15_PL2 This method retrieves and verifies the list of signatories by
	 *             department.
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 *
	 * @return Response - The API response includes the HTTP status code, status
	 *         message, and a list of signatories in the "Results" field, containing
	 *         details such as EmployeeId, FirstName, and LastName.
	 */

	public Response getImagingDataResponse(String endpoint, Object body) {
		// write your logic here
		return null;
	}

	/**
	 * @Test16_PL2 This method retrieves and verifies the list of signatories by
	 *             department.
	 * @param endpoint - The API endpoint to which the GET request is sent.
	 * @param body     - Optional
	 *
	 * @return Response - The API response includes the HTTP status code, status
	 *         message, and a list of signatories in the "Results" field, containing
	 *         details such as EmployeeId, FirstName, and LastName.
	 */

	public Response getsignatoriesDetails(String endpoint, Object body) {
		// write your logic here
		return null;
	}
}