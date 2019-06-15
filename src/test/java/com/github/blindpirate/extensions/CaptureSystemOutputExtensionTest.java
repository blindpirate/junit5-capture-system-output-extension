package com.github.blindpirate.extensions;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.containsString;

public class CaptureSystemOutputExtensionTest {
    @Test
    @CaptureSystemOutput
    void systemOut(CaptureSystemOutput.OutputCapture outputCapture) {
        outputCapture.expect(containsString("System.out!"));

        System.out.println("Printed to System.out!");
    }

    @Test
    @CaptureSystemOutput
    void systemErr(CaptureSystemOutput.OutputCapture outputCapture) {
        outputCapture.expect(containsString("System.err!"));

        System.err.println("Printed to System.err!");
    }
}
