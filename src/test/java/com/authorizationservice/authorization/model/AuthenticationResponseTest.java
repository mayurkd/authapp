package com.authorizationservice.authorization.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AuthenticationResponseTest {
    @Test
    void testCanEqual() {
        assertFalse((new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "ABC123", 1L, 1L);
        assertTrue(authenticationResponse.canEqual(new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)));
    }

    @Test
    void testConstructor() {
        AuthenticationResponse actualAuthenticationResponse = new AuthenticationResponse();
        actualAuthenticationResponse.setJwtAuthToken("ABC123");
        actualAuthenticationResponse.setServerCurrentTime(1L);
        actualAuthenticationResponse.setTokenExpirationTime(1L);
        actualAuthenticationResponse.setUsername("janedoe");
        assertEquals("ABC123", actualAuthenticationResponse.getJwtAuthToken());
        assertEquals(1L, actualAuthenticationResponse.getServerCurrentTime());
        assertEquals(1L, actualAuthenticationResponse.getTokenExpirationTime());
        assertEquals("janedoe", actualAuthenticationResponse.getUsername());
        assertEquals(
                "AuthenticationResponse(username=janedoe, jwtAuthToken=ABC123, serverCurrentTime=1, tokenExpirationTime"
                        + "=1)",
                actualAuthenticationResponse.toString());
    }

    @Test
    void testConstructor2() {
        AuthenticationResponse actualAuthenticationResponse = new AuthenticationResponse("janedoe", "ABC123", 1L, 1L);

        assertEquals("ABC123", actualAuthenticationResponse.getJwtAuthToken());
        assertEquals("janedoe", actualAuthenticationResponse.getUsername());
        assertEquals(1L, actualAuthenticationResponse.getTokenExpirationTime());
        assertEquals(1L, actualAuthenticationResponse.getServerCurrentTime());
    }

    @Test
    void testEquals() {
        assertFalse((new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)).equals(null));
        assertFalse(
                (new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)).equals("Different type to AuthenticationResponse"));
    }

    @Test
    void testEquals2() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "ABC123", 1L, 1L);
        assertTrue(authenticationResponse.equals(authenticationResponse));
        int expectedHashCodeResult = authenticationResponse.hashCode();
        assertEquals(expectedHashCodeResult, authenticationResponse.hashCode());
    }

    @Test
    void testEquals3() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "ABC123", 1L, 1L);
        AuthenticationResponse authenticationResponse1 = new AuthenticationResponse("janedoe", "ABC123", 1L, 1L);

        assertTrue(authenticationResponse.equals(authenticationResponse1));
        int expectedHashCodeResult = authenticationResponse.hashCode();
        assertEquals(expectedHashCodeResult, authenticationResponse1.hashCode());
    }

    @Test
    void testEquals4() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("ABC123", "ABC123", 1L, 1L);
        assertFalse(authenticationResponse.equals(new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)));
    }

    @Test
    void testEquals5() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse(null, "ABC123", 1L, 1L);
        assertFalse(authenticationResponse.equals(new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)));
    }

    @Test
    void testEquals6() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "janedoe", 1L, 1L);
        assertFalse(authenticationResponse.equals(new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)));
    }

    @Test
    void testEquals7() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", null, 1L, 1L);
        assertFalse(authenticationResponse.equals(new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)));
    }

    @Test
    void testEquals8() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "ABC123", 0L, 1L);
        assertFalse(authenticationResponse.equals(new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)));
    }

    @Test
    void testEquals9() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", "ABC123", 1L, 0L);
        assertFalse(authenticationResponse.equals(new AuthenticationResponse("janedoe", "ABC123", 1L, 1L)));
    }

    @Test
    void testEquals10() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse(null, "ABC123", 1L, 1L);
        AuthenticationResponse authenticationResponse1 = new AuthenticationResponse(null, "ABC123", 1L, 1L);

        assertTrue(authenticationResponse.equals(authenticationResponse1));
        int expectedHashCodeResult = authenticationResponse.hashCode();
        assertEquals(expectedHashCodeResult, authenticationResponse1.hashCode());
    }

    @Test
    void testEquals11() {
        AuthenticationResponse authenticationResponse = new AuthenticationResponse("janedoe", null, 1L, 1L);
        AuthenticationResponse authenticationResponse1 = new AuthenticationResponse("janedoe", null, 1L, 1L);

        assertTrue(authenticationResponse.equals(authenticationResponse1));
        int expectedHashCodeResult = authenticationResponse.hashCode();
        assertEquals(expectedHashCodeResult, authenticationResponse1.hashCode());
    }
}

