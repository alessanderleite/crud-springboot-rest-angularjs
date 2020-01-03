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
});