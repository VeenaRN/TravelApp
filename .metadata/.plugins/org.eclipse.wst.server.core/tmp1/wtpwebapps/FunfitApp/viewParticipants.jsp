<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.model.Participant" %>

<!DOCTYPE html>
<html>
<head>
    <title>View Participants</title>
</head>
<body>
    <h2>Participants in Batch</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
            <%-- Use Java code to iterate over participants and display them --%>
            <%
                // Java code to retrieve participants from request attribute and iterate over them
                List<Participant> participants = (List<Participant>) request.getAttribute("participants");
                if (participants != null && !participants.isEmpty()) {
                    for (Participant participant : participants) {
            %>
            <tr>
                <td><%= participant.getId() %></td>
                <td><%= participant.getName() %></td>
                <td><%= participant.getEmail() %></td>
            </tr>
            <%
                    }
                } else {
            %>
            <tr>
                <td colspan="3">No participants found.</td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
