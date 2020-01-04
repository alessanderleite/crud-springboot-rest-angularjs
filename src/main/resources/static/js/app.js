var app = angular.module('EmployeeManagement', []);

//controller Part
app.controller('EmployeeController', function($scope, $http) {
	
    $scope.employees = [];
    $scope.employeeForm = {
        empId: 1,
        empNo: '',
        empName: ''
    };
 
    // Now load the data from server
    _refreshEmployeeData();

    // Private Method  
	// HTTP GET- get all employees collection
	// Call: http://localhost:8080/employees
	function _refreshEmployeeData() {
	    $http({
	        method: 'GET',
	        url: '/employees'
	    }).then(
	        function(res) { // success
	            $scope.employees = res.data;
	        },
	        function(res) { // error
	            console.log("Error: " + res.status + " : " + res.data);
	        }
	    );
	}
	
	function _success(res) {
		_refreshEmployeeData();
		_clearFormData();
	}
	
	function _error(res) {
		var data = res.data;
		var status = res.status;
		var header = res.header;
		var config = res.config;
		alert("Error: " + status + ": " + data);
	}
	
	//Clear the form
	function _clearFormData() {
		$scope.employeeForm.empId = -1;
		$scope.employeeForm.empNo = '';
		$scope.employeeForm.empName= ''
	};
});